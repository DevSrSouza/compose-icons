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

public val SharpGroup.Ballot: ImageVector
    get() {
        if (_ballot != null) {
            return _ballot!!
        }
        _ballot = Builder(name = "Ballot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 16.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _ballot!!
    }

private var _ballot: ImageVector? = null
