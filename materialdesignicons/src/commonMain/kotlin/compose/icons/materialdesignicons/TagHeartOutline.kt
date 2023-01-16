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

public val MaterialDesignIcons.TagHeartOutline: ImageVector
    get() {
        if (_tagHeartOutline != null) {
            return _tagHeartOutline!!
        }
        _tagHeartOutline = Builder(name = "TagHeartOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.55f, 2.22f, 12.05f, 2.59f, 12.42f)
                lineTo(11.59f, 21.42f)
                curveTo(11.95f, 21.78f, 12.45f, 22.0f, 13.0f, 22.0f)
                curveTo(13.55f, 22.0f, 14.05f, 21.78f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.78f, 14.05f, 22.0f, 13.55f, 22.0f, 13.0f)
                curveTo(22.0f, 12.45f, 21.77f, 11.94f, 21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                moveTo(11.0f, 4.0f)
                lineTo(20.0f, 13.0f)
                lineTo(13.0f, 20.0f)
                lineTo(4.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                moveTo(6.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 5.0f)
                moveTo(10.95f, 10.5f)
                curveTo(9.82f, 10.5f, 8.9f, 11.42f, 8.9f, 12.55f)
                curveTo(8.9f, 13.12f, 9.13f, 13.62f, 9.5f, 14.0f)
                lineTo(13.0f, 17.5f)
                lineTo(16.5f, 14.0f)
                curveTo(16.87f, 13.63f, 17.1f, 13.11f, 17.1f, 12.55f)
                arcTo(2.05f, 2.05f, 0.0f, false, false, 15.05f, 10.5f)
                curveTo(14.5f, 10.5f, 13.97f, 10.73f, 13.6f, 11.1f)
                lineTo(13.0f, 11.7f)
                lineTo(12.4f, 11.11f)
                curveTo(12.03f, 10.73f, 11.5f, 10.5f, 10.95f, 10.5f)
                close()
            }
        }
        .build()
        return _tagHeartOutline!!
    }

private var _tagHeartOutline: ImageVector? = null
