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

public val MaterialDesignIcons.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 7.04f)
                curveTo(20.37f, 7.38f, 20.04f, 7.71f, 20.03f, 8.04f)
                curveTo(20.0f, 8.36f, 20.34f, 8.69f, 20.66f, 9.0f)
                curveTo(21.14f, 9.5f, 21.61f, 9.95f, 21.59f, 10.44f)
                curveTo(21.57f, 10.93f, 21.06f, 11.44f, 20.55f, 11.94f)
                lineTo(16.42f, 16.08f)
                lineTo(15.0f, 14.66f)
                lineTo(19.25f, 10.42f)
                lineTo(18.29f, 9.46f)
                lineTo(16.87f, 10.87f)
                lineTo(13.12f, 7.12f)
                lineTo(16.96f, 3.29f)
                curveTo(17.35f, 2.9f, 18.0f, 2.9f, 18.37f, 3.29f)
                lineTo(20.71f, 5.63f)
                curveTo(21.1f, 6.0f, 21.1f, 6.65f, 20.71f, 7.04f)
                moveTo(3.0f, 17.25f)
                lineTo(12.56f, 7.68f)
                lineTo(16.31f, 11.43f)
                lineTo(6.75f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
