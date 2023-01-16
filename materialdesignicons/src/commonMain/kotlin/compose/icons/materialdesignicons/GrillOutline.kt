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

public val MaterialDesignIcons.GrillOutline: ImageVector
    get() {
        if (_grillOutline != null) {
            return _grillOutline!!
        }
        _grillOutline = Builder(name = "GrillOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 14.18f, 18.0f)
                horizontalLineTo(9.14f)
                lineTo(11.13f, 14.94f)
                arcTo(6.36f, 6.36f, 0.0f, false, false, 12.87f, 14.94f)
                lineTo(13.89f, 16.5f)
                curveTo(14.31f, 16.0f, 14.85f, 15.56f, 15.5f, 15.3f)
                lineTo(14.89f, 14.37f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 19.0f, 8.0f)
                horizontalLineTo(5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 9.12f, 14.37f)
                lineTo(5.17f, 20.45f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.84f, 21.54f)
                lineTo(7.84f, 20.0f)
                horizontalLineTo(14.18f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 22.0f)
                moveTo(17.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 19.0f)
                curveTo(18.0f, 19.55f, 17.55f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(16.0f, 19.55f, 16.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 18.0f)
                moveTo(7.42f, 10.0f)
                horizontalLineTo(16.58f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.42f, 10.0f)
                moveTo(9.41f, 7.0f)
                horizontalLineTo(10.41f)
                curveTo(10.56f, 5.85f, 10.64f, 5.36f, 9.5f, 4.04f)
                curveTo(9.1f, 3.54f, 8.84f, 3.27f, 9.06f, 2.0f)
                horizontalLineTo(8.07f)
                arcTo(3.14f, 3.14f, 0.0f, false, false, 8.96f, 4.96f)
                curveTo(9.18f, 5.2f, 9.75f, 5.63f, 9.41f, 7.0f)
                moveTo(11.89f, 7.0f)
                horizontalLineTo(12.89f)
                curveTo(13.04f, 5.85f, 13.12f, 5.36f, 12.0f, 4.04f)
                curveTo(11.58f, 3.54f, 11.32f, 3.26f, 11.54f, 2.0f)
                horizontalLineTo(10.55f)
                arcTo(3.14f, 3.14f, 0.0f, false, false, 11.44f, 4.96f)
                curveTo(11.67f, 5.2f, 12.24f, 5.63f, 11.89f, 7.0f)
                moveTo(14.41f, 7.0f)
                horizontalLineTo(15.41f)
                curveTo(15.56f, 5.85f, 15.64f, 5.36f, 14.5f, 4.04f)
                curveTo(14.1f, 3.54f, 13.84f, 3.27f, 14.06f, 2.0f)
                horizontalLineTo(13.07f)
                arcTo(3.14f, 3.14f, 0.0f, false, false, 13.96f, 4.96f)
                curveTo(14.18f, 5.2f, 14.75f, 5.63f, 14.41f, 7.0f)
                close()
            }
        }
        .build()
        return _grillOutline!!
    }

private var _grillOutline: ImageVector? = null
