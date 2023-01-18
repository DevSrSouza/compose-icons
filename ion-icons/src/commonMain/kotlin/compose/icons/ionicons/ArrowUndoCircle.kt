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

public val IonIcons.ArrowUndoCircle: ImageVector
    get() {
        if (_arrowUndoCircle != null) {
            return _arrowUndoCircle!!
        }
        _arrowUndoCircle = Builder(name = "ArrowUndoCircle", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(353.67f, 329.1f)
                curveToRelative(-24.07f, -25.21f, -51.51f, -38.68f, -108.58f, -38.68f)
                verticalLineToRelative(37.32f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, true, -14.05f, 6.0f)
                lineTo(146.58f, 254.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.0f, -11.94f)
                lineTo(231.0f, 162.29f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, true, 14.05f, 6.0f)
                verticalLineToRelative(37.32f)
                curveToRelative(88.73f, 0.0f, 117.42f, 55.64f, 122.87f, 117.09f)
                curveTo(368.65f, 330.42f, 359.07f, 334.75f, 353.67f, 329.1f)
                close()
            }
        }
        .build()
        return _arrowUndoCircle!!
    }

private var _arrowUndoCircle: ImageVector? = null
