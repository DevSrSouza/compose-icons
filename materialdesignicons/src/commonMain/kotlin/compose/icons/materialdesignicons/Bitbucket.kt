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

public val MaterialDesignIcons.Bitbucket: ImageVector
    get() {
        if (_bitbucket != null) {
            return _bitbucket!!
        }
        _bitbucket = Builder(name = "Bitbucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.65f, 3.0f)
                curveTo(2.3f, 3.0f, 2.0f, 3.3f, 2.0f, 3.65f)
                curveTo(2.0f, 3.69f, 2.0f, 3.73f, 2.0f, 3.77f)
                lineTo(4.73f, 20.27f)
                curveTo(4.8f, 20.69f, 5.16f, 21.0f, 5.58f, 21.0f)
                horizontalLineTo(18.63f)
                curveTo(18.94f, 21.0f, 19.22f, 20.78f, 19.27f, 20.46f)
                lineTo(22.0f, 3.77f)
                curveTo(22.05f, 3.42f, 21.81f, 3.09f, 21.46f, 3.04f)
                curveTo(21.43f, 3.03f, 21.39f, 3.03f, 21.35f, 3.03f)
                lineTo(2.65f, 3.0f)
                moveTo(14.1f, 14.95f)
                horizontalLineTo(9.94f)
                lineTo(8.81f, 9.07f)
                horizontalLineTo(15.11f)
                lineTo(14.1f, 14.95f)
                close()
            }
        }
        .build()
        return _bitbucket!!
    }

private var _bitbucket: ImageVector? = null
