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

public val IonIcons.FileTrayStacked: ImageVector
    get() {
        if (_fileTrayStacked != null) {
            return _fileTrayStacked!!
        }
        _fileTrayStacked = Builder(name = "FileTrayStacked", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 352.0f)
                horizontalLineTo(320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -96.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(416.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(368.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 464.0f, 352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.46f, 187.88f)
                lineTo(447.61f, 68.45f)
                curveTo(441.27f, 35.59f, 417.54f, 16.0f, 384.0f, 16.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-16.8f, 0.0f, -31.0f, 4.69f, -42.1f, 13.94f)
                reflectiveCurveTo(67.66f, 52.0f, 64.4f, 68.4f)
                lineTo(32.54f, 187.88f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.0f, 192.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 35.29f, 28.71f, 80.0f, 64.0f, 80.0f)
                horizontalLineTo(416.0f)
                curveToRelative(35.29f, 0.0f, 64.0f, -44.71f, 64.0f, -80.0f)
                verticalLineTo(192.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 479.46f, 187.88f)
                close()
                moveTo(440.57f, 176.0f)
                horizontalLineTo(320.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, -16.0f, 15.82f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 192.0f, 176.0f)
                horizontalLineTo(71.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.93f, -2.52f)
                lineTo(95.71f, 75.0f)
                curveTo(99.26f, 56.59f, 109.52f, 48.0f, 128.0f, 48.0f)
                horizontalLineTo(384.0f)
                curveToRelative(18.59f, 0.0f, 28.84f, 8.53f, 32.25f, 26.85f)
                lineToRelative(26.25f, 98.63f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 440.57f, 176.0f)
                close()
            }
        }
        .build()
        return _fileTrayStacked!!
    }

private var _fileTrayStacked: ImageVector? = null
