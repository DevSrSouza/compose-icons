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

public val MaterialDesignIcons.TagFaces: ImageVector
    get() {
        if (_tagFaces != null) {
            return _tagFaces!!
        }
        _tagFaces = Builder(name = "TagFaces", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                curveTo(11.68f, 18.0f, 9.0f, 15.31f, 9.0f, 12.0f)
                curveTo(9.0f, 8.68f, 11.68f, 6.0f, 15.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 21.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 15.0f, 18.0f)
                moveTo(4.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 13.0f)
                moveTo(22.0f, 3.0f)
                horizontalLineTo(7.63f)
                curveTo(6.97f, 3.0f, 6.38f, 3.32f, 6.0f, 3.81f)
                lineTo(0.0f, 12.0f)
                lineTo(6.0f, 20.18f)
                curveTo(6.38f, 20.68f, 6.97f, 21.0f, 7.63f, 21.0f)
                horizontalLineTo(22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(24.0f, 3.89f, 23.1f, 3.0f, 22.0f, 3.0f)
                moveTo(13.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 11.0f)
                moveTo(15.0f, 16.0f)
                curveTo(16.86f, 16.0f, 18.35f, 14.72f, 18.8f, 13.0f)
                horizontalLineTo(11.2f)
                curveTo(11.65f, 14.72f, 13.14f, 16.0f, 15.0f, 16.0f)
                moveTo(17.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _tagFaces!!
    }

private var _tagFaces: ImageVector? = null
