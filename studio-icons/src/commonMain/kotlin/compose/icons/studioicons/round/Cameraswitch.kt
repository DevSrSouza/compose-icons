package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Cameraswitch: ImageVector
    get() {
        if (_cameraswitch != null) {
            return _cameraswitch!!
        }
        _cameraswitch = Builder(name = "Cameraswitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 7.9f, 17.1f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.45f, 0.28f)
                curveTo(9.05f, 0.36f, 8.9f, 0.84f, 9.19f, 1.12f)
                lineToRelative(3.01f, 3.01f)
                curveToRelative(0.32f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f)
                verticalLineTo(2.04f)
                curveToRelative(4.45f, 0.44f, 8.06f, 3.82f, 8.84f, 8.17f)
                curveToRelative(0.08f, 0.46f, 0.5f, 0.78f, 0.97f, 0.78f)
                curveToRelative(0.62f, 0.0f, 1.09f, -0.57f, 0.98f, -1.18f)
                curveTo(22.61f, 2.89f, 15.79f, -1.12f, 9.45f, 0.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8f, 19.87f)
                curveToRelative(-0.32f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f)
                verticalLineToRelative(1.74f)
                curveToRelative(-4.45f, -0.44f, -8.06f, -3.82f, -8.84f, -8.17f)
                curveToRelative(-0.08f, -0.46f, -0.5f, -0.78f, -0.97f, -0.78f)
                curveToRelative(-0.62f, 0.0f, -1.09f, 0.57f, -0.98f, 1.18f)
                curveToRelative(1.24f, 6.92f, 8.06f, 10.93f, 14.4f, 9.53f)
                curveToRelative(0.39f, -0.09f, 0.55f, -0.56f, 0.26f, -0.85f)
                lineTo(11.8f, 19.87f)
                close()
            }
        }
        .build()
        return _cameraswitch!!
    }

private var _cameraswitch: ImageVector? = null
