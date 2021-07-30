package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Settings2: ImageVector
    get() {
        if (_settings2 != null) {
            return _settings2!!
        }
        _settings2 = Builder(name = "Settings2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.94f, 22.0f)
                lineTo(11.05f, 22.0f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, true, -1.68f, -1.68f)
                lineTo(9.37f, 19.23f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, -0.22f, -0.29f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, -0.41f, 0.0f)
                lineTo(8.0f, 19.74f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, -2.37f, 0.0f)
                lineTo(4.26f, 18.4f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, true, -0.5f, -1.19f)
                arcTo(1.72f, 1.72f, 0.0f, false, true, 4.26f, 16.0f)
                lineTo(5.0f, 15.26f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.0f, -0.37f)
                curveToRelative(-0.06f, -0.15f, -0.16f, -0.26f, -0.3f, -0.26f)
                lineTo(3.68f, 14.63f)
                arcTo(1.69f, 1.69f, 0.0f, false, true, 2.0f, 12.94f)
                lineTo(2.0f, 11.05f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 3.68f, 9.37f)
                lineTo(4.77f, 9.37f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.29f, -0.22f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, 0.0f, -0.41f)
                lineTo(4.26f, 8.0f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 0.0f, -2.37f)
                lineTo(5.6f, 4.26f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, 1.18f, -0.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.72f, 1.72f, 0.0f, false, true, 8.0f, 4.26f)
                lineTo(8.74f, 5.0f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.37f, 0.0f)
                curveToRelative(0.15f, -0.06f, 0.26f, -0.16f, 0.26f, -0.3f)
                lineTo(9.37f, 3.68f)
                arcTo(1.69f, 1.69f, 0.0f, false, true, 11.06f, 2.0f)
                lineTo(13.0f, 2.0f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, true, 1.68f, 1.68f)
                lineTo(14.68f, 4.77f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.22f, 0.29f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, 0.41f, 0.0f)
                lineTo(16.0f, 4.26f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 2.37f, 0.0f)
                lineTo(19.74f, 5.6f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 0.5f, 1.19f)
                arcTo(1.63f, 1.63f, 0.0f, false, true, 19.74f, 8.0f)
                lineTo(19.0f, 8.74f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.0f, 0.37f)
                curveToRelative(0.06f, 0.15f, 0.16f, 0.26f, 0.3f, 0.26f)
                horizontalLineToRelative(1.09f)
                arcTo(1.69f, 1.69f, 0.0f, false, true, 22.0f, 11.06f)
                lineTo(22.0f, 13.0f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, true, -1.68f, 1.68f)
                lineTo(19.23f, 14.68f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, -0.29f, 0.22f)
                verticalLineToRelative(0.0f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.0f, 0.37f)
                lineToRelative(0.77f, 0.77f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 0.0f, 2.37f)
                lineTo(18.4f, 19.74f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -1.18f, 0.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, true, -1.19f, -0.5f)
                lineTo(15.26f, 19.0f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, -0.37f, 0.0f)
                curveToRelative(-0.15f, 0.06f, -0.26f, 0.16f, -0.26f, 0.3f)
                verticalLineToRelative(1.09f)
                arcTo(1.69f, 1.69f, 0.0f, false, true, 12.94f, 22.0f)
                close()
                moveTo(11.37f, 20.0f)
                horizontalLineToRelative(1.26f)
                verticalLineToRelative(-0.77f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 1.46f, -2.14f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, true, 2.59f, 0.47f)
                lineToRelative(0.54f, 0.54f)
                lineToRelative(0.88f, -0.88f)
                lineToRelative(-0.54f, -0.55f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -0.48f, -2.56f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 2.14f, -1.45f)
                lineTo(20.0f, 12.66f)
                lineTo(20.0f, 11.37f)
                horizontalLineToRelative(-0.77f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, -2.14f, -1.46f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, true, 0.47f, -2.59f)
                lineToRelative(0.54f, -0.54f)
                lineToRelative(-0.88f, -0.88f)
                lineToRelative(-0.55f, 0.54f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, -4.0f, -1.67f)
                lineTo(12.67f, 4.0f)
                lineTo(11.37f, 4.0f)
                verticalLineToRelative(0.77f)
                arcTo(2.33f, 2.33f, 0.0f, false, true, 9.91f, 6.91f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, true, -2.59f, -0.47f)
                lineTo(6.78f, 5.9f)
                lineToRelative(-0.88f, 0.88f)
                lineToRelative(0.54f, 0.55f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, -1.67f, 4.0f)
                lineTo(4.0f, 11.33f)
                verticalLineToRelative(1.26f)
                horizontalLineToRelative(0.77f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 2.14f, 1.46f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, true, -0.47f, 2.59f)
                lineToRelative(-0.54f, 0.54f)
                lineToRelative(0.88f, 0.88f)
                lineToRelative(0.55f, -0.54f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, 4.0f, 1.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 15.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 15.5f)
                close()
                moveTo(12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 10.5f)
                close()
            }
        }
        .build()
        return _settings2!!
    }

private var _settings2: ImageVector? = null
