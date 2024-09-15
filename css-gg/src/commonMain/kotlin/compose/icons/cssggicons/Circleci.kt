package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Circleci: ImageVector
    get() {
        if (_circleci != null) {
            return _circleci!!
        }
        _circleci = Builder(name = "Circleci", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveTo(0.0f, 18.627f, 5.373f, 24.0f, 12.0f, 24.0f)
                curveTo(18.627f, 24.0f, 24.0f, 18.627f, 24.0f, 12.0f)
                curveTo(24.0f, 5.373f, 18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(4.144f, 13.517f)
                curveTo(4.852f, 17.21f, 8.1f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(8.089f, 4.0f, 4.833f, 6.807f, 4.137f, 10.517f)
                lineTo(6.728f, 10.507f)
                curveTo(7.378f, 8.207f, 9.492f, 6.522f, 12.0f, 6.522f)
                curveTo(15.025f, 6.522f, 17.478f, 8.975f, 17.478f, 12.0f)
                curveTo(17.478f, 15.025f, 15.025f, 17.478f, 12.0f, 17.478f)
                curveTo(9.498f, 17.478f, 7.387f, 15.8f, 6.732f, 13.507f)
                lineTo(4.144f, 13.517f)
                close()
                moveTo(9.522f, 12.0f)
                curveTo(9.522f, 13.368f, 10.632f, 14.478f, 12.0f, 14.478f)
                curveTo(13.368f, 14.478f, 14.478f, 13.368f, 14.478f, 12.0f)
                curveTo(14.478f, 10.632f, 13.368f, 9.522f, 12.0f, 9.522f)
                curveTo(10.632f, 9.522f, 9.522f, 10.632f, 9.522f, 12.0f)
                close()
            }
        }
        .build()
        return _circleci!!
    }

private var _circleci: ImageVector? = null
