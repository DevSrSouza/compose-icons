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

public val SolidGroup.AnchorCircleCheck: ImageVector
    get() {
        if (_anchorCircleCheck != null) {
            return _anchorCircleCheck!!
        }
        _anchorCircleCheck = Builder(name = "AnchorCircleCheck", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                close()
                moveTo(341.1f, 176.0f)
                curveTo(367.0f, 158.8f, 384.0f, 129.4f, 384.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 33.4f, 17.0f, 62.8f, 42.9f, 80.0f)
                lineTo(224.0f, 176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                lineTo(256.0f, 448.0f)
                lineTo(208.0f, 448.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                verticalLineToRelative(-6.1f)
                lineToRelative(7.0f, 7.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(97.0f, 263.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(7.0f, 319.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(7.0f, -7.0f)
                lineTo(47.9f, 352.0f)
                curveToRelative(0.0f, 88.4f, 71.6f, 160.0f, 160.0f, 160.0f)
                horizontalLineToRelative(80.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(8.2f, 0.0f, 16.3f, -0.6f, 24.2f, -1.8f)
                curveToRelative(-22.2f, -16.2f, -40.4f, -37.5f, -53.0f, -62.2f)
                lineTo(320.0f, 448.0f)
                lineTo(320.0f, 368.0f)
                lineTo(320.0f, 240.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(341.1f, 176.0f)
                close()
                moveTo(640.0f, 368.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(563.3f, 324.7f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-40.0f, -40.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineTo(480.0f, 385.4f)
                lineToRelative(60.7f, -60.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                close()
            }
        }
        .build()
        return _anchorCircleCheck!!
    }

private var _anchorCircleCheck: ImageVector? = null
