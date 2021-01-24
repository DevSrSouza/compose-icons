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

public val SolidGroup.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 287.88f)
                curveToRelative(0.0f, 51.64f, 22.14f, 73.83f, 56.0f, 84.6f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(-43.52f)
                curveToRelative(33.86f, -10.77f, 56.0f, -33.0f, 56.0f, -84.6f)
                curveToRelative(0.0f, -30.61f, -10.73f, -67.1f, -26.69f, -102.56f)
                lineTo(185.0f, 285.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineToRelative(-11.31f, -11.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(270.27f, 155.1f)
                curveToRelative(-20.8f, -37.91f, -46.47f, -72.1f, -70.87f, -92.59f)
                curveTo(213.4f, 59.09f, 224.0f, 47.05f, 224.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                curveToRelative(0.0f, 15.0f, 10.6f, 27.09f, 24.6f, 30.51f)
                curveTo(67.81f, 106.8f, 8.0f, 214.5f, 8.0f, 287.88f)
                close()
                moveTo(304.0f, 448.0f)
                horizontalLineTo(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(288.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
