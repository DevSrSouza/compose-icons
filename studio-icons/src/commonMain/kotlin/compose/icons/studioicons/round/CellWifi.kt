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

public val RoundGroup.CellWifi: ImageVector
    get() {
        if (_cellWifi != null) {
            return _cellWifi!!
        }
        _cellWifi = Builder(name = "CellWifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.29f, 7.68f)
                lineTo(7.7f, 20.29f)
                curveTo(7.07f, 20.92f, 7.52f, 22.0f, 8.41f, 22.0f)
                horizontalLineTo(21.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(8.39f)
                curveTo(22.0f, 7.5f, 20.92f, 7.05f, 20.29f, 7.68f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.22f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.61f, 10.68f)
                curveToRelative(-0.28f, 0.17f, -0.32f, 0.56f, -0.09f, 0.79f)
                lineToRelative(0.82f, 0.82f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.82f, -0.82f)
                curveToRelative(0.23f, -0.23f, 0.18f, -0.62f, -0.09f, -0.79f)
                curveTo(11.61f, 10.14f, 10.49f, 10.14f, 9.61f, 10.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.42f, 9.3f)
                curveToRelative(1.57f, -1.12f, 3.7f, -1.12f, 5.27f, 0.0f)
                curveToRelative(0.36f, 0.26f, 0.85f, 0.22f, 1.16f, -0.1f)
                curveToRelative(0.39f, -0.39f, 0.35f, -1.06f, -0.1f, -1.38f)
                curveToRelative(-2.2f, -1.57f, -5.19f, -1.57f, -7.4f, 0.0f)
                curveTo(6.9f, 8.14f, 6.85f, 8.81f, 7.25f, 9.2f)
                curveTo(7.57f, 9.52f, 8.06f, 9.56f, 8.42f, 9.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.26f, 6.69f)
                curveToRelative(0.34f, 0.28f, 0.83f, 0.28f, 1.14f, -0.03f)
                lineToRelative(0.12f, -0.12f)
                curveToRelative(0.35f, -0.35f, 0.31f, -0.92f, -0.08f, -1.24f)
                curveToRelative(-3.67f, -3.05f, -9.02f, -3.07f, -12.7f, -0.06f)
                curveTo(4.31f, 5.59f, 4.27f, 6.23f, 4.66f, 6.61f)
                curveTo(4.98f, 6.94f, 5.5f, 6.98f, 5.85f, 6.69f)
                curveTo(8.86f, 4.21f, 13.25f, 4.21f, 16.26f, 6.69f)
                close()
            }
        }
        .build()
        return _cellWifi!!
    }

private var _cellWifi: ImageVector? = null
