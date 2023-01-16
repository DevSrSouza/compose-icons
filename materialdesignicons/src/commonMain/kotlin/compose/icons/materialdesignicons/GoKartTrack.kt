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

public val MaterialDesignIcons.GoKartTrack: ImageVector
    get() {
        if (_goKartTrack != null) {
            return _goKartTrack!!
        }
        _goKartTrack = Builder(name = "GoKartTrack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.0f, 5.5f)
                verticalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                curveTo(10.0f, 9.0f, 9.0f, 6.0f, 6.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 8.0f)
                curveTo(6.86f, 8.0f, 7.42f, 8.45f, 8.32f, 9.24f)
                curveTo(9.28f, 10.27f, 10.6f, 10.9f, 12.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 6.0f)
                verticalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 5.5f)
                curveTo(19.86f, 6.35f, 19.58f, 7.18f, 19.17f, 7.94f)
                curveTo(18.5f, 9.2f, 18.11f, 10.58f, 18.0f, 12.0f)
                curveTo(18.09f, 13.37f, 18.5f, 14.71f, 19.21f, 15.89f)
                curveTo(19.6f, 16.54f, 19.87f, 17.25f, 20.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 18.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 12.25f, 14.25f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 8.5f, 18.0f)
                verticalLineTo(18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 22.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 10.5f, 18.5f)
                verticalLineTo(18.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.25f, 16.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 22.0f, 18.0f)
                curveTo(22.0f, 16.0f, 20.0f, 14.0f, 20.0f, 12.0f)
                curveTo(20.0f, 10.0f, 22.0f, 7.5f, 22.0f, 5.5f)
                close()
            }
        }
        .build()
        return _goKartTrack!!
    }

private var _goKartTrack: ImageVector? = null
