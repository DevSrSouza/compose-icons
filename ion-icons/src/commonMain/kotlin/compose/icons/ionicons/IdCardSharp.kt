package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.IdCardSharp: ImageVector
    get() {
        if (_idCardSharp != null) {
            return _idCardSharp!!
        }
        _idCardSharp = Builder(name = "IdCardSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 16.0f)
                horizontalLineTo(104.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 80.0f, 40.0f)
                verticalLineTo(472.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 408.0f, 16.0f)
                close()
                moveTo(346.9f, 312.77f)
                arcToRelative(43.0f, 43.0f, 0.0f, true, true, -40.71f, -40.71f)
                arcTo(43.0f, 43.0f, 0.0f, false, true, 346.9f, 312.77f)
                close()
                moveTo(192.0f, 64.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(192.0f)
                close()
                moveTo(384.0f, 448.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(423.4f)
                curveToRelative(0.0f, -32.72f, 53.27f, -49.21f, 80.0f, -49.21f)
                reflectiveCurveToRelative(80.0f, 16.49f, 80.0f, 49.21f)
                close()
            }
        }
        .build()
        return _idCardSharp!!
    }

private var _idCardSharp: ImageVector? = null
