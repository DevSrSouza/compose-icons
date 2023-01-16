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

public val MaterialDesignIcons.FuriganaVertical: ImageVector
    get() {
        if (_furiganaVertical != null) {
            return _furiganaVertical!!
        }
        _furiganaVertical = Builder(name = "FuriganaVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.95f)
                curveTo(11.53f, 10.13f, 10.5f, 11.5f, 9.16f, 12.67f)
                curveTo(8.12f, 11.74f, 7.35f, 10.82f, 6.82f, 10.0f)
                horizontalLineTo(4.5f)
                curveTo(5.08f, 11.25f, 6.13f, 12.62f, 7.62f, 13.96f)
                lineTo(3.55f, 17.22f)
                lineTo(2.76f, 17.84f)
                lineTo(4.0f, 19.41f)
                lineTo(4.8f, 18.78f)
                lineTo(9.17f, 15.28f)
                lineTo(13.55f, 18.78f)
                lineTo(14.33f, 19.41f)
                lineTo(15.58f, 17.84f)
                lineTo(14.8f, 17.22f)
                lineTo(10.73f, 13.97f)
                curveTo(12.34f, 12.5f, 13.7f, 10.85f, 14.07f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                moveTo(19.5f, 6.0f)
                curveTo(18.12f, 6.0f, 17.0f, 7.12f, 17.0f, 8.5f)
                reflectiveCurveTo(18.12f, 11.0f, 19.5f, 11.0f)
                reflectiveCurveTo(22.0f, 9.88f, 22.0f, 8.5f)
                reflectiveCurveTo(20.88f, 6.0f, 19.5f, 6.0f)
                moveTo(19.47f, 13.0f)
                curveTo(18.09f, 13.0f, 16.97f, 14.12f, 16.97f, 15.5f)
                reflectiveCurveTo(18.09f, 18.0f, 19.47f, 18.0f)
                reflectiveCurveTo(21.97f, 16.88f, 21.97f, 15.5f)
                reflectiveCurveTo(20.85f, 13.0f, 19.47f, 13.0f)
                close()
            }
        }
        .build()
        return _furiganaVertical!!
    }

private var _furiganaVertical: ImageVector? = null
