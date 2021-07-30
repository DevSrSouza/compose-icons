package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = Builder(name = "Profile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 9.0f)
                curveTo(16.0f, 11.2091f, 14.2091f, 13.0f, 12.0f, 13.0f)
                curveTo(9.7909f, 13.0f, 8.0f, 11.2091f, 8.0f, 9.0f)
                curveTo(8.0f, 6.7909f, 9.7909f, 5.0f, 12.0f, 5.0f)
                curveTo(14.2091f, 5.0f, 16.0f, 6.7909f, 16.0f, 9.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 10.1046f, 13.1046f, 11.0f, 12.0f, 11.0f)
                curveTo(10.8954f, 11.0f, 10.0f, 10.1046f, 10.0f, 9.0f)
                curveTo(10.0f, 7.8954f, 10.8954f, 7.0f, 12.0f, 7.0f)
                curveTo(13.1046f, 7.0f, 14.0f, 7.8954f, 14.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveTo(5.9249f, 1.0f, 1.0f, 5.9249f, 1.0f, 12.0f)
                curveTo(1.0f, 18.0751f, 5.9249f, 23.0f, 12.0f, 23.0f)
                curveTo(18.0751f, 23.0f, 23.0f, 18.0751f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9249f, 18.0751f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 14.0902f, 3.7125f, 16.014f, 4.908f, 17.5417f)
                curveTo(6.5525f, 15.3889f, 9.1463f, 14.0f, 12.0645f, 14.0f)
                curveTo(14.9448f, 14.0f, 17.5092f, 15.3531f, 19.1565f, 17.4583f)
                curveTo(20.313f, 15.9443f, 21.0f, 14.0524f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(9.8498f, 21.0f, 7.8756f, 20.2459f, 6.3277f, 18.9878f)
                curveTo(7.5935f, 17.1812f, 9.6911f, 16.0f, 12.0645f, 16.0f)
                curveTo(14.4084f, 16.0f, 16.4833f, 17.1521f, 17.7538f, 18.9209f)
                curveTo(16.1939f, 20.2191f, 14.1881f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
