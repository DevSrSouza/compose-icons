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

public val MaterialDesignIcons.StarFace: ImageVector
    get() {
        if (_starFace != null) {
            return _starFace!!
        }
        _starFace = Builder(name = "StarFace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                lineTo(8.42f, 8.06f)
                lineTo(2.0f, 9.74f)
                lineTo(6.2f, 14.88f)
                lineTo(5.82f, 21.5f)
                lineTo(12.0f, 19.09f)
                lineTo(18.18f, 21.5f)
                lineTo(17.8f, 14.88f)
                lineTo(22.0f, 9.74f)
                lineTo(15.58f, 8.06f)
                lineTo(12.0f, 2.5f)
                moveTo(9.38f, 10.5f)
                curveTo(10.0f, 10.5f, 10.5f, 11.0f, 10.5f, 11.63f)
                arcTo(1.12f, 1.12f, 0.0f, false, true, 9.38f, 12.75f)
                curveTo(8.75f, 12.75f, 8.25f, 12.25f, 8.25f, 11.63f)
                curveTo(8.25f, 11.0f, 8.75f, 10.5f, 9.38f, 10.5f)
                moveTo(14.63f, 10.5f)
                curveTo(15.25f, 10.5f, 15.75f, 11.0f, 15.75f, 11.63f)
                arcTo(1.12f, 1.12f, 0.0f, false, true, 14.63f, 12.75f)
                curveTo(14.0f, 12.75f, 13.5f, 12.25f, 13.5f, 11.63f)
                curveTo(13.5f, 11.0f, 14.0f, 10.5f, 14.63f, 10.5f)
                moveTo(9.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(14.5f, 16.21f, 13.31f, 17.0f, 12.0f, 17.0f)
                curveTo(10.69f, 17.0f, 9.5f, 16.21f, 9.0f, 15.0f)
                close()
            }
        }
        .build()
        return _starFace!!
    }

private var _starFace: ImageVector? = null
