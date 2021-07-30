package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Settings2: ImageVector
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
                moveTo(12.0f, 12.0f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.32f, 9.37f)
                horizontalLineTo(19.23f)
                curveToRelative(-0.14f, 0.0f, -0.24f, -0.11f, -0.3f, -0.26f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.0f, -0.37f)
                lineTo(19.74f, 8.0f)
                arcToRelative(1.63f, 1.63f, 0.0f, false, false, 0.5f, -1.18f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, false, -0.5f, -1.19f)
                lineTo(18.4f, 4.26f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, false, -2.37f, 0.0f)
                lineTo(15.26f, 5.0f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, -0.41f, 0.0f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, -0.22f, -0.29f)
                verticalLineTo(3.68f)
                arcTo(1.68f, 1.68f, 0.0f, false, false, 13.0f, 2.0f)
                horizontalLineTo(11.06f)
                arcTo(1.69f, 1.69f, 0.0f, false, false, 9.37f, 3.68f)
                verticalLineTo(4.77f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.24f, -0.26f, 0.3f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, -0.37f, 0.0f)
                lineTo(8.0f, 4.26f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, -1.19f, -0.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.18f, 0.5f)
                lineTo(4.26f, 5.6f)
                arcTo(1.67f, 1.67f, 0.0f, false, false, 4.26f, 8.0f)
                lineTo(5.0f, 8.74f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, 0.0f, 0.41f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, -0.29f, 0.22f)
                horizontalLineTo(3.68f)
                arcTo(1.68f, 1.68f, 0.0f, false, false, 2.0f, 11.05f)
                verticalLineToRelative(1.89f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, false, 1.68f, 1.69f)
                horizontalLineTo(4.77f)
                curveToRelative(0.14f, 0.0f, 0.24f, 0.11f, 0.3f, 0.26f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.0f, 0.37f)
                lineTo(4.26f, 16.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, -0.5f, 1.19f)
                arcToRelative(1.66f, 1.66f, 0.0f, false, false, 0.5f, 1.19f)
                lineTo(5.6f, 19.74f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, false, 2.37f, 0.0f)
                lineTo(8.74f, 19.0f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, 0.41f, 0.0f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.22f, 0.29f)
                verticalLineToRelative(1.09f)
                arcTo(1.68f, 1.68f, 0.0f, false, false, 11.05f, 22.0f)
                horizontalLineToRelative(1.89f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, false, 1.69f, -1.68f)
                verticalLineTo(19.23f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.24f, 0.26f, -0.3f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.37f, 0.0f)
                lineToRelative(0.76f, 0.77f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 1.19f, 0.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 1.18f, -0.5f)
                lineToRelative(1.34f, -1.34f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, false, 0.0f, -2.37f)
                lineTo(19.0f, 15.26f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.0f, -0.37f)
                verticalLineToRelative(0.0f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.29f, -0.22f)
                horizontalLineToRelative(1.09f)
                arcTo(1.68f, 1.68f, 0.0f, false, false, 22.0f, 13.0f)
                verticalLineTo(11.06f)
                arcTo(1.69f, 1.69f, 0.0f, false, false, 20.32f, 9.37f)
                close()
                moveTo(12.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 15.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _settings2!!
    }

private var _settings2: ImageVector? = null
