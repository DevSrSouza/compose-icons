package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.GooglePlusSquare: ImageVector
    get() {
        if (_googlePlusSquare != null) {
            return _googlePlusSquare!!
        }
        _googlePlusSquare = Builder(name = "GooglePlusSquare", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(13.594f, 11.0f)
                curveTo(11.056f, 11.0f, 9.0f, 13.056f, 9.0f, 15.584f)
                curveTo(9.0f, 18.122f, 11.056f, 20.178f, 13.594f, 20.178f)
                curveTo(16.238f, 20.178f, 18.0f, 18.321f, 18.0f, 15.699f)
                curveTo(18.0f, 15.406f, 17.969f, 15.231f, 17.916f, 15.0f)
                lineTo(13.594f, 15.0f)
                lineTo(13.594f, 16.518f)
                lineTo(16.195f, 16.518f)
                curveTo(16.091f, 17.189f, 15.409f, 18.49f, 13.594f, 18.49f)
                curveTo(12.031f, 18.49f, 10.752f, 17.201f, 10.752f, 15.596f)
                curveTo(10.752f, 13.991f, 12.031f, 12.689f, 13.594f, 12.689f)
                curveTo(14.485f, 12.689f, 15.084f, 13.077f, 15.42f, 13.402f)
                lineTo(16.668f, 12.205f)
                curveTo(15.861f, 11.45f, 14.832f, 11.0f, 13.594f, 11.0f)
                close()
                moveTo(20.33f, 14.0f)
                lineTo(20.33f, 15.33f)
                lineTo(19.0f, 15.33f)
                lineTo(19.0f, 16.67f)
                lineTo(20.33f, 16.67f)
                lineTo(20.33f, 18.0f)
                lineTo(21.67f, 18.0f)
                lineTo(21.67f, 16.67f)
                lineTo(23.0f, 16.67f)
                lineTo(23.0f, 15.33f)
                lineTo(21.67f, 15.33f)
                lineTo(21.67f, 14.0f)
                lineTo(20.33f, 14.0f)
                close()
            }
        }
        .build()
        return _googlePlusSquare!!
    }

private var _googlePlusSquare: ImageVector? = null
