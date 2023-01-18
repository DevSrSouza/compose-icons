package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.BugSharp: ImageVector
    get() {
        if (_bugSharp != null) {
            return _bugSharp!!
        }
        _bugSharp = Builder(name = "BugSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 304.13f)
                verticalLineToRelative(-32.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(215.2f)
                curveToRelative(29.42f, -27.95f, 32.0f, -64.76f, 32.0f, -103.2f)
                verticalLineTo(96.0f)
                horizontalLineTo(400.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 28.0f, -1.86f, 48.15f, -9.9f, 63.84f)
                curveTo(368.0f, 128.0f, 324.32f, 112.0f, 256.0f, 112.0f)
                curveToRelative(-39.8f, 0.0f, -75.19f, 7.06f, -100.43f, 24.32f)
                curveToRelative(-14.9f, 10.19f, -25.2f, 24.91f, -32.7f, 39.72f)
                curveTo(114.0f, 160.57f, 112.0f, 140.82f, 112.0f, 112.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(80.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 37.44f, 2.59f, 73.36f, 32.0f, 101.2f)
                verticalLineToRelative(58.93f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(32.0f)
                lineToRelative(80.0f, -0.13f)
                curveToRelative(0.0f, 19.0f, 3.7f, 53.09f, 10.39f, 69.69f)
                curveTo(96.6f, 396.76f, 80.0f, 422.31f, 80.0f, 464.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, -27.66f, 9.1f, -44.71f, 26.17f, -61.32f)
                curveTo(160.0f, 448.0f, 177.0f, 464.0f, 240.0f, 464.0f)
                verticalLineTo(176.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(464.0f)
                curveToRelative(65.0f, 0.0f, 80.0f, -16.0f, 101.83f, -61.32f)
                curveTo(390.9f, 419.29f, 400.0f, 436.35f, 400.0f, 464.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, -41.68f, -16.6f, -67.23f, -42.39f, -90.31f)
                curveTo(396.3f, 357.09f, 400.0f, 323.0f, 400.0f, 304.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveToRelative(-48.06f, 0.0f, -96.0f, 0.0f, -96.0f, 84.0f)
                curveToRelative(26.12f, -14.0f, 59.35f, -20.0f, 96.0f, -20.0f)
                curveToRelative(24.09f, 0.0f, 46.09f, 2.65f, 65.39f, 8.0f)
                curveToRelative(10.75f, 3.0f, 24.66f, 8.71f, 30.61f, 12.0f)
                curveTo(352.0f, 32.0f, 304.06f, 32.0f, 256.0f, 32.0f)
                close()
            }
        }
        .build()
        return _bugSharp!!
    }

private var _bugSharp: ImageVector? = null
