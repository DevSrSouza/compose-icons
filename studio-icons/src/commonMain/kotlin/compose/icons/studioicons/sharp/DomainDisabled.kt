package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DomainDisabled: ImageVector
    get() {
        if (_domainDisabled != null) {
            return _domainDisabled!!
        }
        _domainDisabled = Builder(name = "DomainDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.41f, 1.69f)
                lineTo(0.0f, 3.1f)
                lineToRelative(2.0f, 2.0f)
                lineTo(2.0f, 21.0f)
                horizontalLineToRelative(15.9f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-20.9f, -20.9f)
                close()
                moveTo(6.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 15.0f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 11.0f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.9f)
                lineToRelative(2.0f, 2.0f)
                lineTo(12.0f, 19.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.45f)
                lineTo(12.0f, 9.45f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.45f)
                lineToRelative(2.0f, 2.0f)
                lineTo(22.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                lineTo(12.0f, 3.0f)
                lineTo(5.55f, 3.0f)
                lineTo(8.0f, 5.45f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _domainDisabled!!
    }

private var _domainDisabled: ImageVector? = null
