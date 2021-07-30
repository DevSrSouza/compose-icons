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

public val SolidGroup.Hands: ImageVector
    get() {
        if (_hands != null) {
            return _hands!!
        }
        _hands = Builder(name = "Hands", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.8f, 230.4f)
                curveToRelative(-10.6f, -14.1f, -30.7f, -17.0f, -44.8f, -6.4f)
                curveToRelative(-14.1f, 10.6f, -17.0f, 30.7f, -6.4f, 44.8f)
                lineToRelative(38.1f, 50.8f)
                curveToRelative(4.8f, 6.4f, 4.1f, 15.3f, -1.5f, 20.9f)
                lineToRelative(-12.8f, 12.8f)
                curveToRelative(-6.7f, 6.7f, -17.6f, 6.2f, -23.6f, -1.1f)
                lineTo(64.0f, 244.4f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(0.0f, 78.3f, 0.0f, 96.0f)
                verticalLineToRelative(218.4f)
                curveToRelative(0.0f, 10.9f, 3.7f, 21.5f, 10.5f, 30.0f)
                lineToRelative(104.1f, 134.3f)
                curveToRelative(5.0f, 6.5f, 8.4f, 13.9f, 10.4f, 21.7f)
                curveToRelative(1.8f, 6.9f, 8.1f, 11.6f, 15.3f, 11.6f)
                horizontalLineTo(272.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, -27.7f, -9.0f, -54.6f, -25.6f, -76.8f)
                lineToRelative(-57.6f, -76.8f)
                close()
                moveTo(608.0f, 64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(148.4f)
                lineToRelative(-89.8f, 107.8f)
                curveToRelative(-6.0f, 7.2f, -17.0f, 7.7f, -23.6f, 1.1f)
                lineToRelative(-12.8f, -12.8f)
                curveToRelative(-5.6f, -5.6f, -6.3f, -14.5f, -1.5f, -20.9f)
                lineToRelative(38.1f, -50.8f)
                curveToRelative(10.6f, -14.1f, 7.7f, -34.2f, -6.4f, -44.8f)
                curveToRelative(-14.1f, -10.6f, -34.2f, -7.7f, -44.8f, 6.4f)
                lineToRelative(-57.6f, 76.8f)
                curveTo(361.0f, 329.4f, 352.0f, 356.3f, 352.0f, 384.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(131.7f)
                curveToRelative(7.1f, 0.0f, 13.5f, -4.7f, 15.3f, -11.6f)
                curveToRelative(2.0f, -7.8f, 5.4f, -15.2f, 10.4f, -21.7f)
                lineToRelative(104.1f, -134.3f)
                curveToRelative(6.8f, -8.5f, 10.5f, -19.1f, 10.5f, -30.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _hands!!
    }

private var _hands: ImageVector? = null
