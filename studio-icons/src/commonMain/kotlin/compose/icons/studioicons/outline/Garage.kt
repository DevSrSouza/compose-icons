package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(20.0f)
                close()
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
                moveTo(15.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.78f, 18.5f)
                horizontalLineToRelative(0.44f)
                curveTo(6.65f, 18.5f, 7.0f, 18.14f, 7.0f, 17.69f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.19f)
                curveToRelative(0.0f, 0.45f, 0.34f, 0.81f, 0.78f, 0.81f)
                horizontalLineToRelative(0.44f)
                curveToRelative(0.43f, 0.0f, 0.78f, -0.36f, 0.78f, -0.81f)
                verticalLineToRelative(-6.5f)
                curveToRelative(-0.82f, -2.46f, -1.34f, -4.03f, -1.56f, -4.69f)
                curveToRelative(-0.05f, -0.16f, -0.12f, -0.29f, -0.19f, -0.4f)
                curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f)
                curveToRelative(-0.38f, -0.52f, -0.92f, -0.53f, -0.92f, -0.53f)
                horizontalLineTo(7.72f)
                curveToRelative(0.0f, 0.0f, -0.54f, 0.01f, -0.92f, 0.54f)
                curveTo(6.78f, 6.06f, 6.77f, 6.08f, 6.75f, 6.1f)
                curveTo(6.68f, 6.21f, 6.61f, 6.34f, 6.56f, 6.5f)
                curveTo(6.34f, 7.16f, 5.82f, 8.72f, 5.0f, 11.19f)
                verticalLineToRelative(6.5f)
                curveTo(5.0f, 18.14f, 5.35f, 18.5f, 5.78f, 18.5f)
                close()
                moveTo(8.33f, 7.5f)
                horizontalLineToRelative(7.34f)
                lineToRelative(0.23f, 0.69f)
                lineToRelative(0.43f, 1.31f)
                horizontalLineTo(7.67f)
                lineTo(8.33f, 7.5f)
                close()
                moveTo(7.0f, 11.51f)
                verticalLineTo(11.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(0.01f)
                verticalLineToRelative(2.99f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.51f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
