package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) {
            return _squareHalfBottom!!
        }
        _squareHalfBottom = Builder(name = "SquareHalfBottom", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 36.0f)
                lineTo(52.0f, 36.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 36.0f, 52.0f)
                lineTo(36.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(204.0f, 220.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(220.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 204.0f, 36.0f)
                close()
                moveTo(204.0f, 52.0f)
                verticalLineToRelative(76.0f)
                lineTo(52.0f, 128.0f)
                lineTo(52.0f, 52.0f)
                close()
            }
        }
        .build()
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null