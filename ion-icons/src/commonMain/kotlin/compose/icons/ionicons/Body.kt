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

public val IonIcons.Body: ImageVector
    get() {
        if (_body != null) {
            return _body!!
        }
        _body = Builder(name = "Body", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-56.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(437.0f, 128.0f)
                horizontalLineTo(75.0f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, false, 0.0f, 54.0f)
                horizontalLineTo(176.88f)
                curveToRelative(6.91f, 0.0f, 15.0f, 3.09f, 19.58f, 15.0f)
                curveToRelative(5.35f, 13.83f, 2.73f, 40.54f, -0.57f, 61.23f)
                lineToRelative(-4.32f, 24.45f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.12f, 0.35f)
                lineToRelative(-34.6f, 196.81f)
                arcTo(27.43f, 27.43f, 0.0f, false, false, 179.0f, 511.58f)
                arcToRelative(27.06f, 27.06f, 0.0f, false, false, 31.42f, -22.29f)
                lineToRelative(23.91f, -136.8f)
                reflectiveCurveTo(242.0f, 320.0f, 256.0f, 320.0f)
                curveToRelative(14.23f, 0.0f, 21.74f, 32.49f, 21.74f, 32.49f)
                lineToRelative(23.91f, 136.92f)
                arcToRelative(27.24f, 27.24f, 0.0f, true, false, 53.62f, -9.6f)
                lineTo(320.66f, 283.0f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.11f, -0.35f)
                lineToRelative(-4.33f, -24.45f)
                curveToRelative(-3.3f, -20.69f, -5.92f, -47.4f, -0.57f, -61.23f)
                curveToRelative(4.56f, -11.88f, 12.91f, -15.0f, 19.28f, -15.0f)
                horizontalLineTo(437.0f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, false, 0.0f, -54.0f)
                close()
            }
        }
        .build()
        return _body!!
    }

private var _body: ImageVector? = null
