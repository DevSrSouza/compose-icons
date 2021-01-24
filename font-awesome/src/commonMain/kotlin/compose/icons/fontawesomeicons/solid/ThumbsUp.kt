package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 224.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(248.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(64.0f, 472.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.745f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.745f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.745f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(384.0f, 81.452f)
                curveToRelative(0.0f, 42.416f, -25.97f, 66.208f, -33.277f, 94.548f)
                horizontalLineToRelative(101.723f)
                curveToRelative(33.397f, 0.0f, 59.397f, 27.746f, 59.553f, 58.098f)
                curveToRelative(0.084f, 17.938f, -7.546f, 37.249f, -19.439f, 49.197f)
                lineToRelative(-0.11f, 0.11f)
                curveToRelative(9.836f, 23.337f, 8.237f, 56.037f, -9.308f, 79.469f)
                curveToRelative(8.681f, 25.895f, -0.069f, 57.704f, -16.382f, 74.757f)
                curveToRelative(4.298f, 17.598f, 2.244f, 32.575f, -6.148f, 44.632f)
                curveTo(440.202f, 511.587f, 389.616f, 512.0f, 346.839f, 512.0f)
                lineToRelative(-2.845f, -0.001f)
                curveToRelative(-48.287f, -0.017f, -87.806f, -17.598f, -119.56f, -31.725f)
                curveToRelative(-15.957f, -7.099f, -36.821f, -15.887f, -52.651f, -16.178f)
                curveToRelative(-6.54f, -0.12f, -11.783f, -5.457f, -11.783f, -11.998f)
                verticalLineToRelative(-213.77f)
                curveToRelative(0.0f, -3.2f, 1.282f, -6.271f, 3.558f, -8.521f)
                curveToRelative(39.614f, -39.144f, 56.648f, -80.587f, 89.117f, -113.111f)
                curveToRelative(14.804f, -14.832f, 20.188f, -37.236f, 25.393f, -58.902f)
                curveTo(282.515f, 39.293f, 291.817f, 0.0f, 312.0f, 0.0f)
                curveToRelative(24.0f, 0.0f, 72.0f, 8.0f, 72.0f, 81.452f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
