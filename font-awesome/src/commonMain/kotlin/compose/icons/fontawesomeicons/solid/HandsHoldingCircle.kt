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

public val SolidGroup.HandsHoldingCircle: ImageVector
    get() {
        if (_handsHoldingCircle != null) {
            return _handsHoldingCircle!!
        }
        _handsHoldingCircle = Builder(name = "HandsHoldingCircle", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 0.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, true, 320.0f, 0.0f)
                close()
                moveTo(40.0f, 64.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(40.0f)
                verticalLineToRelative(80.0f)
                verticalLineToRelative(40.2f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                lineToRelative(51.1f, 51.1f)
                curveToRelative(8.3f, 8.3f, 21.3f, 9.6f, 31.0f, 3.1f)
                curveToRelative(12.9f, -8.6f, 14.7f, -26.9f, 3.7f, -37.8f)
                lineToRelative(-15.2f, -15.2f)
                lineToRelative(-32.0f, -32.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                lineToRelative(15.2f, 15.2f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(25.3f, 25.3f)
                curveToRelative(21.0f, 21.0f, 32.8f, 49.5f, 32.8f, 79.2f)
                lineTo(287.9f, 464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(173.3f, 512.0f)
                curveToRelative(-17.0f, 0.0f, -33.3f, -6.7f, -45.3f, -18.7f)
                lineTo(28.1f, 393.4f)
                curveTo(10.1f, 375.4f, 0.0f, 351.0f, 0.0f, 325.5f)
                lineTo(0.0f, 224.0f)
                lineTo(0.0f, 160.0f)
                lineTo(0.0f, 104.0f)
                curveTo(0.0f, 81.9f, 17.9f, 64.0f, 40.0f, 64.0f)
                close()
                moveTo(600.0f, 64.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(56.0f)
                verticalLineToRelative(64.0f)
                lineTo(640.0f, 325.5f)
                curveToRelative(0.0f, 25.5f, -10.1f, 49.9f, -28.1f, 67.9f)
                lineTo(512.0f, 493.3f)
                curveToRelative(-12.0f, 12.0f, -28.3f, 18.7f, -45.3f, 18.7f)
                lineTo(400.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(352.0f, 385.1f)
                curveToRelative(0.0f, -29.7f, 11.8f, -58.2f, 32.8f, -79.2f)
                lineToRelative(25.3f, -25.3f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(15.2f, -15.2f)
                lineToRelative(32.0f, -32.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-32.0f, 32.0f)
                lineToRelative(-15.2f, 15.2f)
                curveToRelative(-11.0f, 11.0f, -9.2f, 29.2f, 3.7f, 37.8f)
                curveToRelative(9.7f, 6.5f, 22.7f, 5.2f, 31.0f, -3.1f)
                lineToRelative(51.1f, -51.1f)
                curveToRelative(12.0f, -12.0f, 18.7f, -28.3f, 18.7f, -45.3f)
                lineTo(559.9f, 224.0f)
                lineTo(559.9f, 144.0f)
                lineTo(559.9f, 104.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _handsHoldingCircle!!
    }

private var _handsHoldingCircle: ImageVector? = null
