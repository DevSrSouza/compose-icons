package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.8f, 100.0f)
                lineTo(207.2f, 100.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.7f, -14.5f)
                curveToRelative(-3.4f, -16.1f, -14.4f, -30.7f, -31.2f, -41.3f)
                reflectiveCurveTo(149.9f, 28.0f, 128.0f, 28.0f)
                reflectiveCurveTo(84.9f, 33.8f, 68.3f, 44.2f)
                reflectiveCurveTo(40.5f, 69.4f, 37.1f, 85.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 48.8f, 100.0f)
                close()
                moveTo(44.9f, 87.1f)
                curveTo(51.0f, 58.0f, 86.7f, 36.0f, 128.0f, 36.0f)
                reflectiveCurveToRelative(77.0f, 22.0f, 83.1f, 51.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.8f, 3.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.1f, 1.5f)
                lineTo(48.8f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.1f, -1.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 44.9f, 87.1f)
                close()
                moveTo(226.5f, 156.3f)
                lineTo(188.0f, 171.7f)
                lineToRelative(-38.5f, -15.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(108.0f, 171.7f)
                lineTo(69.5f, 156.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.0f, 0.0f)
                lineToRelative(-40.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 3.0f, 7.4f)
                lineTo(44.0f, 173.9f)
                lineTo(44.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(212.0f, 170.7f)
                lineToRelative(17.5f, -7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.0f, -7.4f)
                close()
                moveTo(204.0f, 184.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(80.0f, 212.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(52.0f, 170.7f)
                lineToRelative(16.0f, -6.4f)
                lineToRelative(38.5f, 15.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(148.0f, 164.3f)
                lineToRelative(38.5f, 15.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.0f, 0.0f)
                lineToRelative(14.5f, -5.8f)
                close()
                moveTo(236.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(24.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(232.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 128.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
