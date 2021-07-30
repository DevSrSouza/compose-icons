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

public val FillGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
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
                moveTo(21.89f, 10.32f)
                lineTo(21.1f, 7.8f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -2.88f, -1.51f)
                lineToRelative(-0.34f, 0.11f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, -1.59f, -0.26f)
                lineToRelative(-0.11f, -0.08f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, -0.69f, -1.43f)
                verticalLineTo(4.35f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, false, -0.68f, -1.68f)
                arcTo(2.26f, 2.26f, 0.0f, false, false, 13.21f, 2.0f)
                horizontalLineTo(10.66f)
                arcTo(2.32f, 2.32f, 0.0f, false, false, 8.37f, 4.33f)
                verticalLineToRelative(0.24f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, -0.73f, 1.51f)
                lineToRelative(-0.13f, 0.1f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.78f, 0.29f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -1.68f, 0.12f)
                arcTo(2.18f, 2.18f, 0.0f, false, false, 2.93f, 7.92f)
                lineToRelative(-0.82f, 2.6f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 1.48f, 2.94f)
                lineToRelative(0.16f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, true, 1.12f, 1.22f)
                lineToRelative(0.06f, 0.16f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, -0.23f, 1.86f)
                arcTo(2.37f, 2.37f, 0.0f, false, false, 5.19f, 20.0f)
                lineToRelative(2.07f, 1.57f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 8.61f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 22.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 10.47f, 21.0f)
                lineToRelative(0.23f, -0.33f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.43f, -0.77f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.5f, 0.78f)
                lineToRelative(0.12f, 0.17f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, 3.22f, 0.53f)
                lineTo(19.0f, 19.86f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, 0.5f, -3.23f)
                lineToRelative(-0.26f, -0.38f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 14.6f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, 1.21f, -1.28f)
                lineToRelative(0.2f, -0.07f)
                arcTo(2.36f, 2.36f, 0.0f, false, false, 21.89f, 10.32f)
                close()
                moveTo(12.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 15.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
