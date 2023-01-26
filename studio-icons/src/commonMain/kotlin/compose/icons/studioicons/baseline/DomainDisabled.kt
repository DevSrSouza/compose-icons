package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DomainDisabled: ImageVector
    get() {
        if (_domainDisabled != null) {
            return _domainDisabled!!
        }
        _domainDisabled = Builder(name = "DomainDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.9f)
                lineTo(12.0f, 9.9f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.9f)
                lineToRelative(2.0f, 2.0f)
                lineTo(22.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                lineTo(12.0f, 3.0f)
                lineTo(5.1f, 3.0f)
                lineTo(8.0f, 5.9f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(1.3f, 1.8f)
                lineTo(0.1f, 3.1f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-21.0f, -20.9f)
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
                moveTo(6.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _domainDisabled!!
    }

private var _domainDisabled: ImageVector? = null
