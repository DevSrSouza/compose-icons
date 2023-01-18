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

public val IonIcons.PlaySkipBackCircleSharp: ImageVector
    get() {
        if (_playSkipBackCircleSharp != null) {
            return _playSkipBackCircleSharp!!
        }
        _playSkipBackCircleSharp = Builder(name = "PlaySkipBackCircleSharp", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                curveToRelative(0.0f, 114.69f, 93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.31f, 48.0f, 256.0f)
                close()
                moveTo(176.0f, 176.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(69.0f)
                lineToRelative(128.0f, -77.53f)
                lineTo(336.0f, 344.37f)
                lineTo(208.0f, 267.0f)
                verticalLineToRelative(69.0f)
                lineTo(176.0f, 336.0f)
                close()
            }
        }
        .build()
        return _playSkipBackCircleSharp!!
    }

private var _playSkipBackCircleSharp: ImageVector? = null
