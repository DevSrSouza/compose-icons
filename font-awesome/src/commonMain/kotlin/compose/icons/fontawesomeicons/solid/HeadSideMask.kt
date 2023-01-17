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
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 224.2f)
                curveToRelative(0.0f, -22.2f, 3.2f, -43.6f, 9.2f, -63.9f)
                lineToRelative(227.0f, 165.1f)
                curveTo(228.5f, 337.8f, 224.0f, 352.4f, 224.0f, 368.0f)
                lineTo(224.0f, 512.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 407.3f)
                curveToRelative(0.0f, -16.7f, -6.9f, -32.5f, -17.1f, -45.8f)
                curveTo(16.6f, 322.4f, 0.0f, 274.1f, 0.0f, 224.2f)
                close()
                moveTo(258.6f, 302.1f)
                lineTo(21.0f, 129.3f)
                curveTo(56.7f, 53.0f, 134.2f, 0.0f, 224.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(95.2f, 0.0f, 174.2f, 69.3f, 189.4f, 160.1f)
                curveToRelative(2.2f, 13.0f, 6.7f, 25.7f, 15.0f, 36.1f)
                lineToRelative(42.0f, 52.6f)
                curveToRelative(6.2f, 7.8f, 9.6f, 17.4f, 9.6f, 27.4f)
                curveToRelative(0.0f, 4.1f, -0.6f, 8.1f, -1.6f, 11.9f)
                lineTo(304.0f, 288.1f)
                curveToRelative(-16.9f, 0.0f, -32.5f, 5.2f, -45.4f, 14.1f)
                close()
                moveTo(352.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(256.0f, 512.0f)
                lineTo(256.0f, 368.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineTo(512.0f, 320.0f)
                lineToRelative(-16.0f, 48.0f)
                lineTo(336.0f, 368.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(485.3f, 400.0f)
                lineToRelative(-10.7f, 32.0f)
                lineTo(336.0f, 432.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(464.0f, 464.0f)
                lineToRelative(-1.4f, 4.2f)
                curveToRelative(-8.7f, 26.1f, -33.2f, 43.8f, -60.7f, 43.8f)
                lineTo(256.0f, 512.0f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
