package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                curveTo(14.364f, 2.0f, 15.4697f, 3.1057f, 15.4697f, 4.4697f)
                lineTo(15.469f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 5.0f, 20.0f, 5.4477f, 20.0f, 6.0f)
                lineTo(19.999f, 9.499f)
                lineTo(18.4697f, 9.5f)
                curveTo(17.1603f, 9.5f, 16.0889f, 10.519f, 16.0053f, 11.8073f)
                lineTo(16.0f, 11.9697f)
                verticalLineTo(12.0303f)
                curveTo(16.0f, 13.3397f, 17.019f, 14.4111f, 18.3073f, 14.4947f)
                lineTo(18.4697f, 14.5f)
                lineTo(19.999f, 14.499f)
                lineTo(20.0f, 18.0029f)
                curveTo(20.0f, 18.5552f, 19.5523f, 19.0029f, 19.0f, 19.0029f)
                lineTo(15.469f, 19.002f)
                lineTo(15.4697f, 19.5303f)
                curveTo(15.4697f, 20.8943f, 14.364f, 22.0f, 13.0f, 22.0f)
                curveTo(11.636f, 22.0f, 10.5303f, 20.8943f, 10.5303f, 19.5303f)
                lineTo(10.53f, 19.002f)
                lineTo(7.0f, 19.0029f)
                curveTo(6.4477f, 19.0029f, 6.0f, 18.5552f, 6.0f, 18.0029f)
                lineTo(5.999f, 14.471f)
                lineTo(5.4697f, 14.4712f)
                curveTo(4.1057f, 14.4712f, 3.0f, 13.3654f, 3.0f, 12.0015f)
                curveTo(3.0f, 10.6375f, 4.1057f, 9.5318f, 5.4697f, 9.5318f)
                lineTo(5.999f, 9.531f)
                lineTo(6.0f, 6.0f)
                curveTo(6.0f, 5.4477f, 6.4477f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(10.53f)
                lineTo(10.5303f, 4.4697f)
                curveTo(10.5303f, 3.1057f, 11.636f, 2.0f, 13.0f, 2.0f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
