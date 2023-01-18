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

public val IonIcons.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 164.0f)
                verticalLineTo(408.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineTo(392.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, -56.0f)
                verticalLineTo(164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 64.0f, 164.0f)
                close()
                moveTo(331.0f, 315.63f)
                lineToRelative(-63.69f, 63.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineTo(181.0f, 315.63f)
                curveToRelative(-6.09f, -6.09f, -6.65f, -16.0f, -0.85f, -22.38f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.16f, -0.56f)
                lineTo(240.0f, 329.37f)
                verticalLineTo(224.45f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 272.0f, 224.0f)
                verticalLineTo(329.37f)
                lineToRelative(36.69f, -36.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.16f, 0.56f)
                curveTo(337.65f, 299.62f, 337.09f, 309.54f, 331.0f, 315.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 48.0f)
                lineTo(448.0f, 48.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 480.0f, 80.0f)
                lineTo(480.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 448.0f, 128.0f)
                lineTo(64.0f, 128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 32.0f, 96.0f)
                lineTo(32.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 48.0f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
