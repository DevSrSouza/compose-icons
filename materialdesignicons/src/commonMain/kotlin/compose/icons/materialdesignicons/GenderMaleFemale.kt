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

public val MaterialDesignIcons.GenderMaleFemale: ImageVector
    get() {
        if (_genderMaleFemale != null) {
            return _genderMaleFemale!!
        }
        _genderMaleFemale = Builder(name = "GenderMaleFemale", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.58f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.41f)
                lineTo(15.17f, 9.24f)
                curveTo(15.69f, 10.03f, 16.0f, 11.0f, 16.0f, 12.0f)
                curveTo(16.0f, 14.42f, 14.28f, 16.44f, 12.0f, 16.9f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.9f)
                curveTo(7.72f, 16.44f, 6.0f, 14.42f, 6.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 11.0f, 7.0f)
                curveTo(12.0f, 7.0f, 12.96f, 7.3f, 13.75f, 7.83f)
                lineTo(17.58f, 4.0f)
                moveTo(11.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _genderMaleFemale!!
    }

private var _genderMaleFemale: ImageVector? = null
