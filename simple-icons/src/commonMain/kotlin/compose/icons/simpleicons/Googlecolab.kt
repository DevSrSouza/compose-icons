package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlecolab: ImageVector
    get() {
        if (_googlecolab != null) {
            return _googlecolab!!
        }
        _googlecolab = Builder(name = "Googlecolab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.941f, 4.976f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -4.931f, 2.065f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -0.123f, 9.807f)
                lineToRelative(2.395f, -2.395f)
                arcToRelative(3.645f, 3.645f, 0.0f, false, true, 5.15f, -5.148f)
                lineToRelative(2.397f, -2.399f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -4.888f, -1.93f)
                close()
                moveTo(7.07f, 4.985f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -4.888f, 1.932f)
                lineToRelative(2.391f, 2.391f)
                arcToRelative(3.643f, 3.643f, 0.0f, false, true, 5.023f, 0.127f)
                lineToRelative(1.734f, -2.974f)
                lineToRelative(-0.1f, -0.08f)
                arcTo(7.033f, 7.033f, 0.0f, false, false, 7.07f, 4.985f)
                close()
                moveTo(22.079f, 7.158f)
                lineToRelative(-2.389f, 2.391f)
                arcToRelative(3.645f, 3.645f, 0.0f, false, true, -5.15f, 5.15f)
                lineToRelative(-2.407f, 2.407f)
                arcToRelative(7.036f, 7.036f, 0.0f, false, false, 9.946f, -9.948f)
                close()
                moveTo(1.932f, 7.167f)
                arcToRelative(7.033f, 7.033f, 0.0f, false, false, -0.002f, 9.682f)
                lineToRelative(2.397f, -2.397f)
                arcToRelative(3.643f, 3.643f, 0.0f, false, true, -0.004f, -4.892f)
                close()
                moveTo(9.596f, 14.591f)
                curveToRelative(-1.38f, 1.382f, -3.586f, 1.411f, -5.017f, 0.113f)
                lineToRelative(-2.397f, 2.395f)
                curveToRelative(2.469f, 2.333f, 6.263f, 2.575f, 9.007f, 0.545f)
                lineToRelative(0.137f, -0.112f)
                close()
            }
        }
        .build()
        return _googlecolab!!
    }

private var _googlecolab: ImageVector? = null
