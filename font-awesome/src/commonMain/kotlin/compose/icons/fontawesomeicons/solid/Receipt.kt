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

public val SolidGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(358.4f, 3.2f)
                lineTo(320.0f, 48.0f)
                lineTo(265.6f, 3.2f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -19.2f, 0.0f)
                lineTo(192.0f, 48.0f)
                lineTo(137.6f, 3.2f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -19.2f, 0.0f)
                lineTo(64.0f, 48.0f)
                lineTo(25.6f, 3.2f)
                curveTo(15.0f, -4.7f, 0.0f, 2.8f, 0.0f, 16.0f)
                verticalLineToRelative(480.0f)
                curveToRelative(0.0f, 13.2f, 15.0f, 20.7f, 25.6f, 12.8f)
                lineTo(64.0f, 464.0f)
                lineToRelative(54.4f, 44.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 19.2f, 0.0f)
                lineTo(192.0f, 464.0f)
                lineToRelative(54.4f, 44.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 19.2f, 0.0f)
                lineTo(320.0f, 464.0f)
                lineToRelative(38.4f, 44.8f)
                curveToRelative(10.5f, 7.9f, 25.6f, 0.4f, 25.6f, -12.8f)
                lineTo(384.0f, 16.0f)
                curveToRelative(0.0f, -13.2f, -15.0f, -20.7f, -25.6f, -12.8f)
                close()
                moveTo(320.0f, 360.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                lineTo(72.0f, 368.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(320.0f, 264.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                lineTo(72.0f, 272.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(320.0f, 168.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                lineTo(72.0f, 176.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
