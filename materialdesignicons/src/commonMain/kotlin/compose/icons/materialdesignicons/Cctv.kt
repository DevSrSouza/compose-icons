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

public val MaterialDesignIcons.Cctv: ImageVector
    get() {
        if (_cctv != null) {
            return _cctv!!
        }
        _cctv = Builder(name = "Cctv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.03f, 12.03f)
                lineTo(8.03f, 15.5f)
                lineTo(5.5f, 18.68f)
                lineTo(2.0f, 12.62f)
                lineTo(6.03f, 12.03f)
                moveTo(17.0f, 18.0f)
                verticalLineTo(15.29f)
                curveTo(17.88f, 14.9f, 18.5f, 14.03f, 18.5f, 13.0f)
                curveTo(18.5f, 12.43f, 18.3f, 11.9f, 17.97f, 11.5f)
                lineTo(19.94f, 10.35f)
                curveTo(20.95f, 9.76f, 21.3f, 8.47f, 20.71f, 7.46f)
                lineTo(19.33f, 5.06f)
                curveTo(18.74f, 4.05f, 17.45f, 3.7f, 16.44f, 4.28f)
                lineTo(8.31f, 9.0f)
                curveTo(7.36f, 9.53f, 7.03f, 10.75f, 7.58f, 11.71f)
                lineTo(9.08f, 14.31f)
                curveTo(9.63f, 15.26f, 10.86f, 15.59f, 11.81f, 15.04f)
                lineTo(13.69f, 13.96f)
                curveTo(13.94f, 14.55f, 14.41f, 15.03f, 15.0f, 15.29f)
                verticalLineTo(18.0f)
                curveTo(15.0f, 19.1f, 15.9f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _cctv!!
    }

private var _cctv: ImageVector? = null
