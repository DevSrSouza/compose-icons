package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.WallSconceRound: ImageVector
    get() {
        if (_wallSconceRound != null) {
            return _wallSconceRound!!
        }
        _wallSconceRound = Builder(name = "WallSconceRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                moveTo(19.09f, 16.5f)
                lineTo(20.5f, 15.09f)
                lineTo(18.73f, 13.32f)
                lineTo(17.32f, 14.73f)
                lineTo(19.09f, 16.5f)
                moveTo(4.91f, 16.5f)
                lineTo(6.68f, 14.73f)
                lineTo(5.27f, 13.32f)
                lineTo(3.5f, 15.09f)
                lineTo(4.91f, 16.5f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 9.14f, 18.5f, 6.5f, 16.0f, 5.07f)
                reflectiveCurveTo(10.5f, 3.64f, 8.0f, 5.07f)
                reflectiveCurveTo(4.0f, 9.14f, 4.0f, 12.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _wallSconceRound!!
    }

private var _wallSconceRound: ImageVector? = null
