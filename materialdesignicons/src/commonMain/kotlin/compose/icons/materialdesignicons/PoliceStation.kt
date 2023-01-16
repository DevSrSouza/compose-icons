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

public val MaterialDesignIcons.PoliceStation: ImageVector
    get() {
        if (_policeStation != null) {
            return _policeStation!!
        }
        _policeStation = Builder(name = "PoliceStation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(12.0f, 10.0f, 16.0f, 9.2f, 16.0f, 7.6f)
                curveTo(16.0f, 6.8f, 15.2f, 5.2f, 15.2f, 4.4f)
                curveTo(15.2f, 3.6f, 16.0f, 2.8f, 16.0f, 2.8f)
                lineTo(15.2f, 2.0f)
                curveTo(14.74f, 2.26f, 14.16f, 2.4f, 13.6f, 2.4f)
                reflectiveCurveTo(12.46f, 2.25f, 12.0f, 2.0f)
                curveTo(11.54f, 2.25f, 10.96f, 2.4f, 10.4f, 2.4f)
                curveTo(9.84f, 2.4f, 9.26f, 2.26f, 8.8f, 2.0f)
                lineTo(8.0f, 2.8f)
                curveTo(8.0f, 2.8f, 8.8f, 3.6f, 8.8f, 4.4f)
                curveTo(8.8f, 5.2f, 8.0f, 6.8f, 8.0f, 7.6f)
                curveTo(8.0f, 9.2f, 12.0f, 10.0f, 12.0f, 10.0f)
                moveTo(11.43f, 5.32f)
                lineTo(12.0f, 4.0f)
                lineTo(12.55f, 5.32f)
                lineTo(14.0f, 5.44f)
                lineTo(12.89f, 6.38f)
                lineTo(13.22f, 7.78f)
                lineTo(12.0f, 7.04f)
                lineTo(10.76f, 7.78f)
                lineTo(11.09f, 6.38f)
                lineTo(10.0f, 5.44f)
                lineTo(11.43f, 5.32f)
                moveTo(21.0f, 6.0f)
                horizontalLineTo(16.65f)
                curveTo(16.84f, 6.58f, 17.0f, 7.12f, 17.0f, 7.6f)
                curveTo(17.0f, 9.85f, 13.32f, 10.76f, 12.2f, 11.0f)
                lineTo(12.0f, 11.0f)
                lineTo(11.8f, 11.0f)
                curveTo(10.68f, 10.76f, 7.0f, 9.85f, 7.0f, 7.6f)
                curveTo(7.0f, 7.12f, 7.16f, 6.58f, 7.35f, 6.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 6.0f, 2.0f, 6.45f, 2.0f, 7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 6.45f, 21.55f, 6.0f, 21.0f, 6.0f)
                moveTo(8.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                moveTo(8.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _policeStation!!
    }

private var _policeStation: ImageVector? = null
