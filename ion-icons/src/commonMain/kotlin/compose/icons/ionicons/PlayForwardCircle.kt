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

public val IonIcons.PlayForwardCircle: ImageVector
    get() {
        if (_playForwardCircle != null) {
            return _playForwardCircle!!
        }
        _playForwardCircle = Builder(name = "PlayForwardCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(394.77f, 265.3f)
                lineTo(280.32f, 334.44f)
                arcTo(10.78f, 10.78f, 0.0f, false, true, 264.0f, 325.13f)
                verticalLineTo(271.81f)
                lineTo(160.32f, 334.44f)
                arcTo(10.78f, 10.78f, 0.0f, false, true, 144.0f, 325.13f)
                verticalLineTo(186.87f)
                arcToRelative(10.78f, 10.78f, 0.0f, false, true, 16.32f, -9.31f)
                lineTo(264.0f, 240.19f)
                verticalLineTo(186.87f)
                arcToRelative(10.78f, 10.78f, 0.0f, false, true, 16.32f, -9.31f)
                lineTo(394.77f, 246.7f)
                arcTo(10.89f, 10.89f, 0.0f, false, true, 394.77f, 265.3f)
                close()
            }
        }
        .build()
        return _playForwardCircle!!
    }

private var _playForwardCircle: ImageVector? = null
