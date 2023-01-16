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

public val MaterialDesignIcons.Allergy: ImageVector
    get() {
        if (_allergy != null) {
            return _allergy!!
        }
        _allergy = Builder(name = "Allergy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 5.33f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 18.5f, 6.58f)
                verticalLineTo(11.17f)
                horizontalLineTo(17.67f)
                verticalLineTo(4.08f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.17f, 4.08f)
                verticalLineTo(11.17f)
                horizontalLineTo(14.33f)
                verticalLineTo(3.25f)
                arcTo(1.25f, 1.25f, 0.0f, true, false, 11.83f, 3.25f)
                verticalLineTo(11.17f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.33f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 8.5f, 5.33f)
                verticalLineTo(15.26f)
                lineTo(4.91f, 13.26f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.41f, 13.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.75f, 13.37f)
                lineTo(2.67f, 14.37f)
                lineTo(9.21f, 21.0f)
                arcTo(3.29f, 3.29f, 0.0f, false, false, 11.58f, 22.0f)
                horizontalLineTo(17.67f)
                arcTo(3.33f, 3.33f, 0.0f, false, false, 21.0f, 18.67f)
                verticalLineTo(6.58f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 19.75f, 5.33f)
                moveTo(11.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 12.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 15.0f)
                moveTo(13.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 14.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 18.0f)
                moveTo(18.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 19.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 16.0f)
                moveTo(17.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 19.0f)
                moveTo(15.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 16.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _allergy!!
    }

private var _allergy: ImageVector? = null
