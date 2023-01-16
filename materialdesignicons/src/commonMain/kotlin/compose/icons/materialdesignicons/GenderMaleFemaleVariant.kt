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

public val MaterialDesignIcons.GenderMaleFemaleVariant: ImageVector
    get() {
        if (_genderMaleFemaleVariant != null) {
            return _genderMaleFemaleVariant!!
        }
        _genderMaleFemaleVariant = Builder(name = "GenderMaleFemaleVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.0f, 15.9f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 15.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 3.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 3.0f)
                moveTo(12.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _genderMaleFemaleVariant!!
    }

private var _genderMaleFemaleVariant: ImageVector? = null
