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

public val FilledGroup.CubeTree: ImageVector
    get() {
        if (_cubeTree != null) {
            return _cubeTree!!
        }
        _cubeTree = Builder(name = "CubeTree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7628f, 2.0385f)
                curveTo(11.9168f, 1.9872f, 12.0832f, 1.9872f, 12.2372f, 2.0385f)
                lineTo(15.9872f, 3.2885f)
                curveTo(16.2934f, 3.3906f, 16.5f, 3.6772f, 16.5f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(16.5f, 9.3228f, 16.2934f, 9.6094f, 15.9872f, 9.7115f)
                lineTo(12.75f, 10.7906f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.5f)
                curveTo(15.7426f, 13.0f, 16.75f, 14.0074f, 16.75f, 15.25f)
                verticalLineTo(16.0945f)
                curveTo(18.0439f, 16.4275f, 19.0f, 17.6021f, 19.0f, 19.0f)
                curveTo(19.0f, 20.6569f, 17.6569f, 22.0f, 16.0f, 22.0f)
                curveTo(14.3431f, 22.0f, 13.0f, 20.6569f, 13.0f, 19.0f)
                curveTo(13.0f, 17.6021f, 13.9561f, 16.4275f, 15.25f, 16.0945f)
                verticalLineTo(15.25f)
                curveTo(15.25f, 14.8358f, 14.9142f, 14.5f, 14.5f, 14.5f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 14.5f, 8.75f, 14.8358f, 8.75f, 15.25f)
                verticalLineTo(16.0945f)
                curveTo(10.0439f, 16.4275f, 11.0f, 17.6021f, 11.0f, 19.0f)
                curveTo(11.0f, 20.6569f, 9.6568f, 22.0f, 8.0f, 22.0f)
                curveTo(6.3432f, 22.0f, 5.0f, 20.6569f, 5.0f, 19.0f)
                curveTo(5.0f, 17.6021f, 5.9561f, 16.4275f, 7.25f, 16.0945f)
                verticalLineTo(15.25f)
                curveTo(7.25f, 14.0074f, 8.2574f, 13.0f, 9.5f, 13.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(10.7906f)
                lineTo(8.0128f, 9.7115f)
                curveTo(7.7066f, 9.6094f, 7.5f, 9.3228f, 7.5f, 9.0f)
                verticalLineTo(4.0f)
                curveTo(7.5f, 3.6772f, 7.7066f, 3.3906f, 8.0128f, 3.2885f)
                lineTo(11.7628f, 2.0385f)
                close()
                moveTo(9.7885f, 5.5128f)
                curveTo(9.6575f, 5.9058f, 9.8699f, 6.3305f, 10.2628f, 6.4615f)
                lineTo(11.25f, 6.7906f)
                verticalLineTo(7.75f)
                curveTo(11.25f, 8.1642f, 11.5858f, 8.5f, 12.0f, 8.5f)
                curveTo(12.4142f, 8.5f, 12.75f, 8.1642f, 12.75f, 7.75f)
                verticalLineTo(6.7906f)
                lineTo(13.7372f, 6.4615f)
                curveTo(14.1301f, 6.3305f, 14.3425f, 5.9058f, 14.2115f, 5.5128f)
                curveTo(14.0805f, 5.1199f, 13.6558f, 4.9075f, 13.2628f, 5.0385f)
                lineTo(12.0f, 5.4594f)
                lineTo(10.7372f, 5.0385f)
                curveTo(10.3442f, 4.9075f, 9.9195f, 5.1199f, 9.7885f, 5.5128f)
                close()
            }
        }
        .build()
        return _cubeTree!!
    }

private var _cubeTree: ImageVector? = null
