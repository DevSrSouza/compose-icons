package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlaskOutline: ImageVector
    get() {
        if (_flaskOutline != null) {
            return _flaskOutline!!
        }
        _flaskOutline = Builder(name = "FlaskOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 48.0f)
                lineTo(336.0f, 48.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(118.0f, 304.0f)
                lineTo(394.0f, 304.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                verticalLineToRelative(93.48f)
                arcToRelative(64.09f, 64.09f, 0.0f, false, true, -9.88f, 34.18f)
                lineTo(73.21f, 373.49f)
                curveTo(48.4f, 412.78f, 76.63f, 464.0f, 123.08f, 464.0f)
                horizontalLineTo(388.92f)
                curveToRelative(46.45f, 0.0f, 74.68f, -51.22f, 49.87f, -90.51f)
                lineTo(313.87f, 175.66f)
                arcTo(64.09f, 64.09f, 0.0f, false, true, 304.0f, 141.48f)
                verticalLineTo(48.0f)
            }
        }
        .build()
        return _flaskOutline!!
    }

private var _flaskOutline: ImageVector? = null
