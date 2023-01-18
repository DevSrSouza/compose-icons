package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(37.4f, 47.6f)
                lineTo(96.0f, 216.9f)
                curveToRelative(2.5f, 7.3f, 12.9f, 7.1f, 15.2f, -0.3f)
                lineTo(134.8f, 140.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 5.3f, -5.2f)
                lineToRelative(76.5f, -23.6f)
                curveToRelative(7.4f, -2.3f, 7.6f, -12.7f, 0.3f, -15.2f)
                lineTo(47.6f, 37.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 37.4f, 47.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.5f, 230.3f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -15.1f, -10.8f)
                lineTo(29.8f, 50.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 50.2f, 29.8f)
                lineTo(219.5f, 88.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 10.8f, 15.4f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -11.3f, 15.0f)
                lineToRelative(-76.6f, 23.6f)
                lineTo(118.8f, 219.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -15.0f, 11.2f)
                close()
                moveTo(45.0f, 44.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(58.6f, 169.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(23.5f, -76.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 10.6f, -10.6f)
                lineToRelative(76.6f, -23.5f)
                close()
                moveTo(45.0f, 44.9f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
