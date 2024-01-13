package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HeadSideMask: ImageVector
    get() {
        if (_headSideMask != null) {
            return _headSideMask!!
        }
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 224.2f)
                curveToRelative(0.0f, -22.2f, 3.2f, -43.6f, 9.2f, -63.9f)
                lineTo(262.2f, 321.0f)
                curveToRelative(-4.0f, 9.5f, -6.2f, 20.0f, -6.2f, 31.0f)
                lineTo(256.0f, 512.0f)
                lineTo(128.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(96.0f, 407.3f)
                curveToRelative(0.0f, -16.7f, -6.9f, -32.5f, -17.1f, -45.8f)
                curveTo(48.6f, 322.4f, 32.0f, 274.1f, 32.0f, 224.2f)
                close()
                moveTo(280.3f, 294.6f)
                lineTo(53.0f, 129.3f)
                curveTo(88.7f, 53.0f, 166.2f, 0.0f, 256.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(95.2f, 0.0f, 181.2f, 69.3f, 197.3f, 160.2f)
                curveToRelative(2.3f, 13.0f, 6.8f, 25.7f, 15.1f, 36.0f)
                lineToRelative(42.0f, 52.6f)
                curveToRelative(5.4f, 6.7f, 8.6f, 14.8f, 9.4f, 23.2f)
                lineTo(336.0f, 272.0f)
                curveToRelative(-21.7f, 0.0f, -41.3f, 8.6f, -55.7f, 22.6f)
                close()
                moveTo(336.0f, 304.0f)
                lineTo(534.0f, 304.0f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(-19.7f, 64.0f)
                lineTo(368.0f, 368.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(514.5f, 400.0f)
                lineToRelative(-9.8f, 32.0f)
                lineTo(368.0f, 432.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(494.8f, 464.0f)
                lineToRelative(-0.9f, 2.8f)
                curveToRelative(-8.3f, 26.9f, -33.1f, 45.2f, -61.2f, 45.2f)
                lineTo(288.0f, 512.0f)
                lineTo(288.0f, 352.0f)
                curveToRelative(0.0f, -14.0f, 6.0f, -26.7f, 15.6f, -35.4f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(8.5f, -7.8f, 19.9f, -12.6f, 32.4f, -12.6f)
                close()
                moveTo(384.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
