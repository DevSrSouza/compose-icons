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

public val RoundGroup.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.33f, 7.5f)
                lineToRelative(-0.66f, 2.0f)
                lineToRelative(8.66f, 0.0f)
                lineToRelative(-0.66f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(19.0f, 17.69f)
                curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f)
                horizontalLineToRelative(-0.44f)
                curveToRelative(-0.44f, 0.0f, -0.78f, -0.36f, -0.78f, -0.81f)
                verticalLineTo(16.5f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.19f)
                curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f)
                horizontalLineTo(5.78f)
                curveTo(5.35f, 18.5f, 5.0f, 18.14f, 5.0f, 17.69f)
                verticalLineToRelative(-6.5f)
                curveTo(5.82f, 8.72f, 6.34f, 7.16f, 6.56f, 6.5f)
                curveToRelative(0.05f, -0.16f, 0.12f, -0.29f, 0.19f, -0.4f)
                curveTo(6.77f, 6.08f, 6.78f, 6.06f, 6.8f, 6.04f)
                curveTo(7.18f, 5.51f, 7.72f, 5.5f, 7.72f, 5.5f)
                horizontalLineToRelative(8.56f)
                curveToRelative(0.0f, 0.0f, 0.54f, 0.01f, 0.92f, 0.53f)
                curveToRelative(0.02f, 0.03f, 0.03f, 0.05f, 0.05f, 0.07f)
                curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f)
                curveToRelative(0.22f, 0.66f, 0.74f, 2.23f, 1.56f, 4.69f)
                verticalLineTo(17.69f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
