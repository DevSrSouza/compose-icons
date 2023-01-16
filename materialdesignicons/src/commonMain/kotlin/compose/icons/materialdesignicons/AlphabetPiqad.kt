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

public val MaterialDesignIcons.AlphabetPiqad: ImageVector
    get() {
        if (_alphabetPiqad != null) {
            return _alphabetPiqad!!
        }
        _alphabetPiqad = Builder(name = "AlphabetPiqad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.04f, 4.0f)
                lineTo(6.54f, 17.85f)
                curveTo(6.21f, 18.55f, 5.5f, 19.0f, 4.73f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                curveTo(17.2f, 20.0f, 18.27f, 20.54f, 19.0f, 21.39f)
                horizontalLineTo(20.0f)
                curveTo(19.05f, 19.32f, 17.0f, 18.0f, 14.7f, 18.0f)
                horizontalLineTo(12.0f)
                curveTo(11.29f, 18.0f, 10.62f, 17.63f, 10.24f, 17.03f)
                curveTo(9.85f, 16.43f, 9.8f, 15.68f, 10.1f, 15.03f)
                lineTo(10.58f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.5f)
                curveTo(15.29f, 13.0f, 13.5f, 11.21f, 13.5f, 9.0f)
                curveTo(13.5f, 6.79f, 15.29f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _alphabetPiqad!!
    }

private var _alphabetPiqad: ImageVector? = null
