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

public val MaterialDesignIcons.AccountMusicOutline: ImageVector
    get() {
        if (_accountMusicOutline != null) {
            return _accountMusicOutline!!
        }
        _accountMusicOutline = Builder(name = "AccountMusicOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 4.0f)
                moveTo(11.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 6.0f)
                moveTo(11.0f, 13.0f)
                curveTo(12.1f, 13.0f, 13.66f, 13.23f, 15.11f, 13.69f)
                curveTo(14.5f, 14.07f, 14.0f, 14.6f, 13.61f, 15.23f)
                curveTo(12.79f, 15.03f, 11.89f, 14.9f, 11.0f, 14.9f)
                curveTo(8.03f, 14.9f, 4.9f, 16.36f, 4.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(13.04f)
                curveTo(13.13f, 18.8f, 13.38f, 19.44f, 13.76f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 14.34f, 8.33f, 13.0f, 11.0f, 13.0f)
                moveTo(18.5f, 10.0f)
                horizontalLineTo(20.0f)
                lineTo(22.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 15.0f)
                curveTo(17.86f, 15.0f, 18.19f, 15.07f, 18.5f, 15.21f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _accountMusicOutline!!
    }

private var _accountMusicOutline: ImageVector? = null
