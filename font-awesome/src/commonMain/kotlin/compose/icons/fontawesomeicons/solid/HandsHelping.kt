package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandsHelping: ImageVector
    get() {
        if (_handsHelping != null) {
            return _handsHelping!!
        }
        _handsHelping = Builder(name = "HandsHelping", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.0f, 192.0f)
                lineTo(336.0f, 192.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 39.7f, -32.3f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.3f, -72.0f, -72.0f)
                lineTo(192.0f, 126.4f)
                lineToRelative(-64.9f, 39.0f)
                curveTo(107.8f, 176.9f, 96.0f, 197.8f, 96.0f, 220.2f)
                verticalLineToRelative(47.3f)
                lineToRelative(-80.0f, 46.2f)
                curveTo(0.7f, 322.5f, -4.6f, 342.1f, 4.3f, 357.4f)
                lineToRelative(80.0f, 138.6f)
                curveToRelative(8.8f, 15.3f, 28.4f, 20.5f, 43.7f, 11.7f)
                lineTo(231.4f, 448.0f)
                lineTo(368.0f, 448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(635.7f, 154.6f)
                lineTo(555.7f, 16.0f)
                curveTo(546.9f, 0.7f, 527.3f, -4.5f, 512.0f, 4.3f)
                lineTo(408.6f, 64.0f)
                lineTo(306.4f, 64.0f)
                curveToRelative(-12.0f, 0.0f, -23.7f, 3.4f, -33.9f, 9.7f)
                lineTo(239.0f, 94.6f)
                curveToRelative(-9.4f, 5.8f, -15.0f, 16.1f, -15.0f, 27.1f)
                lineTo(224.0f, 248.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.9f, 40.0f, -40.0f)
                verticalLineToRelative(-88.0f)
                horizontalLineToRelative(184.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                verticalLineToRelative(28.5f)
                lineToRelative(80.0f, -46.2f)
                curveToRelative(15.3f, -8.9f, 20.5f, -28.4f, 11.7f, -43.7f)
                close()
            }
        }
        .build()
        return _handsHelping!!
    }

private var _handsHelping: ImageVector? = null
