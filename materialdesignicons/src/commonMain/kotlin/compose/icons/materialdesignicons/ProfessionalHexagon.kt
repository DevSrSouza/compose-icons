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

public val MaterialDesignIcons.ProfessionalHexagon: ImageVector
    get() {
        if (_professionalHexagon != null) {
            return _professionalHexagon!!
        }
        _professionalHexagon = Builder(name = "ProfessionalHexagon", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.5f)
                curveTo(21.0f, 16.88f, 20.79f, 17.21f, 20.47f, 17.38f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22.0f, 12.0f, 22.0f)
                curveTo(11.79f, 22.0f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3.0f, 16.88f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2.0f, 12.0f, 2.0f)
                curveTo(12.21f, 2.0f, 12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21.0f, 7.12f, 21.0f, 7.5f)
                verticalLineTo(16.5f)
                moveTo(5.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 9.0f)
                horizontalLineTo(5.0f)
                moveTo(6.25f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.75f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.75f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.75f, 12.0f)
                horizontalLineTo(6.25f)
                moveTo(9.75f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.75f)
                lineTo(12.41f, 15.0f)
                horizontalLineTo(13.73f)
                lineTo(12.94f, 12.61f)
                curveTo(13.43f, 12.25f, 13.75f, 11.66f, 13.75f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.75f, 9.0f)
                horizontalLineTo(9.75f)
                moveTo(11.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.5f, 12.0f)
                horizontalLineTo(11.0f)
                moveTo(17.0f, 9.0f)
                curveTo(15.62f, 9.0f, 14.5f, 10.34f, 14.5f, 12.0f)
                curveTo(14.5f, 13.66f, 15.62f, 15.0f, 17.0f, 15.0f)
                curveTo(18.38f, 15.0f, 19.5f, 13.66f, 19.5f, 12.0f)
                curveTo(19.5f, 10.34f, 18.38f, 9.0f, 17.0f, 9.0f)
                moveTo(17.0f, 10.25f)
                curveTo(17.76f, 10.25f, 18.38f, 11.03f, 18.38f, 12.0f)
                curveTo(18.38f, 12.97f, 17.76f, 13.75f, 17.0f, 13.75f)
                curveTo(16.24f, 13.75f, 15.63f, 12.97f, 15.63f, 12.0f)
                curveTo(15.63f, 11.03f, 16.24f, 10.25f, 17.0f, 10.25f)
                close()
            }
        }
        .build()
        return _professionalHexagon!!
    }

private var _professionalHexagon: ImageVector? = null
