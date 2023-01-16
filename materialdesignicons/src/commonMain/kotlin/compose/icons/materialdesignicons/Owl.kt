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

public val MaterialDesignIcons.Owl: ImageVector
    get() {
        if (_owl != null) {
            return _owl!!
        }
        _owl = Builder(name = "Owl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(12.56f, 16.84f, 13.31f, 17.53f, 14.2f, 18.0f)
                lineTo(12.0f, 20.2f)
                lineTo(9.8f, 18.0f)
                curveTo(10.69f, 17.53f, 11.45f, 16.84f, 12.0f, 16.0f)
                moveTo(17.0f, 11.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 13.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 15.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 13.2f)
                curveTo(19.0f, 12.09f, 18.1f, 11.2f, 17.0f, 11.2f)
                moveTo(7.0f, 11.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 13.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 15.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 13.2f)
                curveTo(9.0f, 12.09f, 8.1f, 11.2f, 7.0f, 11.2f)
                moveTo(17.0f, 8.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 12.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 16.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 12.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 8.7f)
                moveTo(7.0f, 8.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 12.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 16.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 3.0f, 12.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 8.7f)
                moveTo(2.24f, 1.0f)
                curveTo(4.0f, 4.7f, 2.73f, 7.46f, 1.55f, 10.2f)
                curveTo(1.19f, 11.0f, 1.0f, 11.83f, 1.0f, 12.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 18.7f)
                curveTo(7.21f, 18.69f, 7.42f, 18.68f, 7.63f, 18.65f)
                lineTo(10.59f, 21.61f)
                lineTo(12.0f, 23.0f)
                lineTo(13.41f, 21.61f)
                lineTo(16.37f, 18.65f)
                curveTo(16.58f, 18.68f, 16.79f, 18.69f, 17.0f, 18.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 23.0f, 12.7f)
                curveTo(23.0f, 11.83f, 22.81f, 11.0f, 22.45f, 10.2f)
                curveTo(21.27f, 7.46f, 20.0f, 4.7f, 21.76f, 1.0f)
                curveTo(19.12f, 3.06f, 15.36f, 4.69f, 12.0f, 4.7f)
                curveTo(8.64f, 4.69f, 4.88f, 3.06f, 2.24f, 1.0f)
                close()
            }
        }
        .build()
        return _owl!!
    }

private var _owl: ImageVector? = null
