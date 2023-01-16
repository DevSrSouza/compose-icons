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

public val MaterialDesignIcons.FuriganaHorizontal: ImageVector
    get() {
        if (_furiganaHorizontal != null) {
            return _furiganaHorizontal!!
        }
        _furiganaHorizontal = Builder(name = "FuriganaHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                curveTo(7.12f, 2.0f, 6.0f, 3.12f, 6.0f, 4.5f)
                reflectiveCurveTo(7.12f, 7.0f, 8.5f, 7.0f)
                reflectiveCurveTo(11.0f, 5.88f, 11.0f, 4.5f)
                reflectiveCurveTo(9.88f, 2.0f, 8.5f, 2.0f)
                moveTo(15.5f, 2.0f)
                curveTo(14.12f, 2.0f, 13.0f, 3.12f, 13.0f, 4.5f)
                reflectiveCurveTo(14.12f, 7.0f, 15.5f, 7.0f)
                reflectiveCurveTo(18.0f, 5.88f, 18.0f, 4.5f)
                reflectiveCurveTo(16.88f, 2.0f, 15.5f, 2.0f)
                moveTo(11.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.95f)
                curveTo(14.53f, 13.13f, 13.5f, 14.5f, 12.16f, 15.67f)
                curveTo(11.12f, 14.74f, 10.35f, 13.82f, 9.82f, 13.0f)
                horizontalLineTo(7.5f)
                curveTo(8.08f, 14.25f, 9.13f, 15.62f, 10.62f, 16.96f)
                lineTo(6.55f, 20.22f)
                lineTo(5.76f, 20.84f)
                lineTo(7.0f, 22.41f)
                lineTo(7.8f, 21.78f)
                lineTo(12.17f, 18.28f)
                lineTo(16.55f, 21.78f)
                lineTo(17.33f, 22.41f)
                lineTo(18.58f, 20.84f)
                lineTo(17.8f, 20.22f)
                lineTo(13.73f, 16.97f)
                curveTo(15.34f, 15.5f, 16.7f, 13.85f, 17.07f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _furiganaHorizontal!!
    }

private var _furiganaHorizontal: ImageVector? = null
